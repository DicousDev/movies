import MovieScore from "../MovieScore";
import { Link } from "react-router-dom";
import { Movie } from "types/movie";

type Props = {
    movie: Movie;
};

function MovieCard({ movie } : Props) {

    return (
        <div>
            <img className="movies-movie-card-image" src={movie.image} alt={movie.title} />
            <div className="movies-card-bottom-container">
                <h3>{movie.title}</h3>
                <MovieScore count={movie.count} score={movie.score} />

                <Link to={`/form/${movie.id}`}>
                    <div className="btn btn-primary movies-btn">Avaliar</div>
                </Link>
            </div>
        </div>
    );
}

export default MovieCard;
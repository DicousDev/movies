import MovieStars from "../MovieStars";
import "./styles.css";

function MovieScore() {

    const score = 3.5;
    const count = 13;

    return (
        <div className="movies-score-container">
            <p className="movies-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars />
            <p className="movies-score-count">{count} avaliações</p>
        </div>
    );
}

export default MovieScore;
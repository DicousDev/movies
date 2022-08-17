import MovieStars from "../MovieStars";
import "./styles.css";

type Props = {
    score: number;
    count: number;
}

function MovieScore({ score, count } : Props) {

    return (
        <div className="movies-score-container">
            <p className="movies-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars score={score}/>
            <p className="movies-score-count">{count} avaliações</p>
        </div>
    );
}

export default MovieScore;
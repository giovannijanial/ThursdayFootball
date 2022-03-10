import MovieStars from "components/movieStars";
import './styles.css';

function MovieScore() {

    const score = 9.5;
    const count = 18;

    return (
        <div className="thufootball-score-container">
            <p className="thufootball-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars />
            <p className="thufootball-score-count">{count} Jogadores </p>
        </div>
    );
}

export default MovieScore;
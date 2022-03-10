import MovieScore from "components/movieScore";
import { Link } from "react-router-dom";


function MovieCard() {

    const movie = {
        id: 1,
        image: "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/l9myeK0Fkr6faSoTlOnx9sogJ4l.jpg",
        title: "Jogo de Quinta-Feira 10/03/2022",
        count: 18,
        score: 9.5
    };

    return (
        <div>
            <img className="thufootball-movie-card-image" src={movie.image} alt={movie.title} />
            <div className="thufootball-card-bottom-container">
                <h3>{movie.title}</h3>
                <MovieScore />
                <Link to={`/form/${movie.id}`}>
                    <div className="btn btn-primary thufootball-btn">Go!</div>
                </Link>
            </div>
        </div>
    );
}
export default MovieCard;
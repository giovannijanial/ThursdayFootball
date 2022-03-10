import './styles.css';
function Form() {

    const game = {
        id: 1,
        image: "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/l9myeK0Fkr6faSoTlOnx9sogJ4l.jpg",
        title: "Jogo de Quinta-Feira 10/03/2022",
        count: 18,
        score: 4.5
    };

    return (
        <div className="thufootball-form-container">
            <img className="thufootball-movie-card-image" src={game.image} alt={game.title} />
            <div className="thufootball-card-bottom-container">
                <h3>{game.title}</h3>
                <form className="thufootball-form">
                    <div className="form-group thufootball-form-group">
                        <label htmlFor="name">Informe seu nome</label>
                        <input type="name" className="form-control" id="name" />
                    </div>
                    <div className="form-group thufootball-form-group">
                        <label htmlFor="email">Informe seu email</label>
                        <input type="email" className="form-control" id="email" />
                    </div>
                    <div className="form-group thufootball-form-group">
                        <label htmlFor="score">Informe a avaliação geral</label>
                        <select className="form-control" id="score">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                            <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                        </select>
                    </div>
                    <div className="thufootball-form-btn-container">
                        <button type="submit" className="btn btn-primary thufootball-btn">Salvar</button>
                        <button type="reset" className="btn btn-danger thufootball-btn">Apagar</button>
                    </div>
                </form >
                <button className="btn btn-primary thufootball-btn mt-3">Voltar</button>
              
                    
            </div >
        </div >
    );
}
export default Form;
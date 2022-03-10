import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function Navbar(){

    return (
        <header>
            <nav className="container">
                <div className="thufootball-nav-content">
                    <a href="https://github.com/giovannijanial" target="_blank" rel="noreferrer">
                        <div className="thufootball-contact-container">
                            <GithubIcon />
                            <p className="thufootball-contact-link">/giovannijanial</p>
                        </div>
                    </a>
                    <h1>Thursday Football</h1>
                    <form className="thufootball-form-inline">
                        <input className="form-control mr-sm-2" type="Buscar" placeholder="Buscar" aria-label="Search"/>
                        <button className="btn btn-outline-success my-2 my-sm-0" type="button">Buscar</button>
                    </form>
                </div>
            </nav>
        </header>
    );

}
export default Navbar;
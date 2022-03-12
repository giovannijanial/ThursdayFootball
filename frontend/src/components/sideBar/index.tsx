import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import './styles.css';

function SideBar() {

    return (
        <header>
            <nav className="navbar navbar-expand-lg navbar-red navbar-dark">
                <div className="wrapper"> </div>
                <div className="container-fluid all-show">
                    <a className="navbar-brand" href="/">ThursdayFootball</a>
                    <button className="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span> </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav mr-auto mb-2 mb-lg-0">
                            <li className="nav-item"> <a className="nav-link active"
                                aria-current="page" href=" ">Jogos</a> </li>
                            <li className="nav-item"> <a className="nav-link" href=" ">Elenco</a> </li>
                            <li className="nav-item"> <a className="nav-link" href=" ">Calendário</a> </li>
                            <li className="nav-item"> <a className="nav-link disabled" href=" ">Ranking</a> </li>
                            <li className="nav-item"> <a className="nav-link" href=" ">Contato</a> </li>
                            <li className="nav-item"> <a className="nav-link" href=" "><FontAwesomeIcon icon="search" /></a> </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
    );
}
export default SideBar;
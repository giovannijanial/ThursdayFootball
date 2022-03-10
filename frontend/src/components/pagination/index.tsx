import { ReactComponent as Arrow } from 'assets/img/arrow.svg';
import './styles.css';

function Pagination() {
    return (
        <div className="thufootball-pagination-container">
            <div className="thufootball-pagination-box">
                <button className="thufootball-pagination-button" disabled={true} >
                    <Arrow />
                </button>
                <p>{`${1} de ${2}`}</p>
                <button className="thufootball-pagination-button" disabled={false} >
                    <Arrow className="thufootball-flip-horizontal" />
                </button>
            </div>
        </div>
    );
}
export default Pagination;
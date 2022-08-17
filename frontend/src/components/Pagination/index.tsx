import { ReactComponent as Arrow } from 'assets/arrow.svg'; 
import { MoviePage } from 'types/movie';
import "./styles.css";

type Props = {
  	page: MoviePage;
	onChange: Function;
}

function Pagination({ page, onChange } : Props) {

	

  	return (
		<div className="movies-pagination-container">
			<div className="movies-pagination-box">
				<button className="movies-pagination-button" disabled={page.first} onClick={() => {onChange(page.number - 1)}}>
					<Arrow />
				</button>
				<p>{`${page.number + 1} de ${page.totalPages}`}</p>
				<button className="movies-pagination-button" disabled={page.last} onClick={() => {onChange(page.number + 1)}}>
					<Arrow className="movies-flip-horizontal" />
				</button>
			</div>
		</div>
  );
}

export default Pagination;

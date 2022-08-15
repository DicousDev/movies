import {ReactComponent as GitHubIcon} from "assets/GitHubIcon.svg";
import "./styles.css";

function Navbar() {

    return (
		<header>
			<nav className="container">
				<div className="movies-nav-content">
					<h1>Movies</h1>
                    <a href="https://github.com/DicousDev" target="_blank">
                        <div className="movies-contact-container">
                            <GitHubIcon/>
                            <p className="movies-contact-link">/DicousDev</p>
                        </div>
                    </a>
                </div>
			</nav>
		</header>
    );
}

export default Navbar;
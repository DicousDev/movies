import {ReactComponent as GitHubIcon} from "assets/GitHubIcon.svg";
import "./styles.css";

function Navbar() {

    return (
		<header>
			<nav className="container">
				<div className="movies-nav-content">
                    <a href="/"><h1>Movies</h1></a>
                    <a href="https://github.com/DicousDev">
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
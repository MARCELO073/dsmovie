import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css'
function Navbar() {
    return (
    <header>
        <nav className="container">
            <div className="dsmovie-nav-content">
                <h1>
                    DsMovies
                </h1>
                <a href="https://github.com/MARCELO073">
                    <div className="dsmovie-contac-contaner">
                        <GithubIcon/>
                        <p className='dsmovie-contatc-link'>/devsuperio</p>
                    </div>
                </a>
            </div>
        </nav>
    </header>
    );
}
export default Navbar;
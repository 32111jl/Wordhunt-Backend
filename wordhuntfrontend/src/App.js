import logo from './wordhunt.gif';
import './App.css';

function App() {
  return (
    <div className="solver">
      <header className="solver-header">
        <img src={logo} className="solver-logo" alt="logo"/>
        <h2>Get the optimal number of points in GamePigeon's WordHunt!</h2>
        <h4>Start by entering your 16-letter board below.</h4>
        <h6>Input reads board from left to right, top down.</h6>
        <form>
          <label>
            Board:    
            <input type="text" className="textInput" placeholder="your word here..."/>
          </label>
          <input type="submit" className="submitInput" value="Submit"/>
        </form>
        <a
          className="about-link"
          href="https://32111jl.github.io/johnnyliujj/"
          target="_blank"
          rel="noopener noreferrer"
        >
          About me!
        </a>
      </header>
    </div>
  );
}

export default App;

import './App.css';
import Logo from './imgs/logo.png';

function App() {
  return (
    <div className="App">
      <div className="logo-contenedor">
        <img 
          className="logo" 
          src = { Logo }
          alt = "Moto en carretera" 
          width={300}
        />
      </div>
    </div>
  );
}

export default App;

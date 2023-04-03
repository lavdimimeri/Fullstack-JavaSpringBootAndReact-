
import './App.css';
import Home from './Home';
import Navbar from './Navbar';
import UserDetails from './UserDetails';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

function App() {
  return(
  <Router>
      <div className="App">
        <Navbar />
        <div className="content">
          <Switch>
            <Route exact path="/">
              <Home />
            </Route>
             <Route path="/users/all/:id">
              <UserDetails />
            </Route>
          </Switch>
        </div>
      </div>
    </Router>
  ); 
}

export default App;

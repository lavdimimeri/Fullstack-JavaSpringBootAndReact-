
import './App.css';
import Home from './Home';
import Navbar from './Navbar';
import UserDetails from './UserDetails';
import Create from './Create';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Update from './update';

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
            <Route path="/create">
              <Create />
            </Route>
             <Route path="/users/all/:id">
              <UserDetails />
            </Route>
            <Route path="/update">
              <Update />
            </Route>
          </Switch>
        </div>
      </div>
    </Router>
  ); 
}

export default App;

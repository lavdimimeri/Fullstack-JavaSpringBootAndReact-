import { useParams, useHistory } from "react-router-dom";
import useFetch from "./useFetch";

import Update from "./update";


const UserDetails = () => {
    const { id } = useParams();
    const { data: user, error, isPending } = useFetch('http://localhost:8080/users/all/' + id);
    const history = useHistory(); 

 

    const handleClick = () => {
      fetch('http://localhost:8080/users/all/' + user.id, {
        method: 'DELETE'
      }).then(() => {
        history.push('/');
      }) 
    }

    return ( 
      <div className="user-details">
             { isPending && <div>Loading...</div> }
             { error && <div>{ error }</div> }
             { user && (
        <article>
          <h2>{ user.id }</h2>
          <p>Written by { user.fullName }</p>
          <div>{ user.email }</div>
          <button onClick={handleClick}>delete</button>
        </article>
      )}

      {user && <Update user={user}/>}
      </div>
     

      
     );
}
 
export default UserDetails;
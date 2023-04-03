import { useParams } from "react-router-dom";
import useFetch from "./useFetch";

const UserDetails = () => {
    const { id } = useParams();
    const { data: user, error, isPending } = useFetch('http://localhost:8080/users/all/' + id);

    return ( 
      <div className="user-details">
             { isPending && <div>Loading...</div> }
             { error && <div>{ error }</div> }
             { user && (
        <article>
          <h2>{ user.id }</h2>
          <p>Written by { user.fullName }</p>
          <div>{ user.email }</div>
        </article>
      )}
        


      </div>

      
     );
}
 
export default UserDetails;
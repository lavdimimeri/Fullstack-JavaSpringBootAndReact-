import UserList from "./UserList";
import useFetch from "./useFetch";

const Home = () => {
           
    const {error, isPending, data:users} = useFetch('http://localhost:8080/users/all');
    return ( 
        <div className="home">
        { error && <div>{ error }</div> }
        { isPending && <div>Loading...</div> }
        { users && <UserList users={users} /> }
      </div>

     );
}
 
export default Home;
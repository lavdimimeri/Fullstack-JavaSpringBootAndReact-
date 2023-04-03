import { Link } from 'react-router-dom';

const UserList = ({users}) => {
  
  return (
    <div className="user-list">
      {users.map(user => (
        <div className="user-preview" key={user.id} >
         <Link to={`/users/all/${user.id}`}>
            <h2>{ user.fullName }</h2>
            <p>User Email { user.email }</p>
            <p>Address of the User { user.address }</p>
            <p>Phone Number of each user { user.phoneNumber }</p>
            </Link>
         
        </div>
       
        
      ))}
      
    </div>
  );
}
 
export default UserList ;
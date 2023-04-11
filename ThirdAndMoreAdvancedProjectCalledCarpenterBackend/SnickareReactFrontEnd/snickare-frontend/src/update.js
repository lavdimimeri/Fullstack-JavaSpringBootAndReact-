import { useState } from "react";
import { useHistory } from "react-router-dom";

const Update = ({user}) => {
       const id = user.id;
       
       const[fullName, setfullName] = useState(user.fullName);
       const [address, setAddress] = useState(user.address);
       const [phoneNumber, setphoneNumber] = useState(user.phoneNumber);
       const [email, setEmail] = useState(user.email);
       const history = useHistory();



       const handleSubmit = (e) => {
        e.preventDefault();
        const user = {id, fullName, address, phoneNumber, email };
    
        fetch('http://localhost:8080/users/all/'+user.id, {
          method: 'PUT',
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify(user)
        }).then(() => {
          // history.go(-1);
          history.push('/');
        })
      }


   
  
    return ( 
        <div className="create">
             <h2>Update User</h2>
        <form onSubmit={handleSubmit}>
          <label>Full Name:</label>
          <input 
            type="text" 
            required 
            value={fullName}
            onChange={(e) => setfullName(e.target.value)}
          />
          <label>Address:</label>
          <textarea
            required
            value={address}
            onChange={(e) => setAddress(e.target.value)}
          ></textarea>
           <label>Phone Number:</label>
             <textarea
            required
            value={phoneNumber}
            onChange={(e) => setphoneNumber(e.target.value)}
          ></textarea>
          <label>Email:</label>
             <textarea
            required
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          ></textarea>
         <button>Update User</button>
        </form>
          
       
       

        </div>
     );
}
 
export default Update;

import React from "react";
import { useNavigate } from "react-router-dom";
import { toast } from "react-hot-toast"; 

const HomePage = () => {
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem("token"); // Clear the JWT
    toast.success("You have logged out successfully!");
    navigate("/login"); 
  };

  return (
    <div className="container mt-5">
      <h2>Welcome to the Home Page</h2>
      <button onClick={handleLogout} className="btn btn-danger mt-3">
        Logout
      </button>
    </div>
  );
};

export default HomePage;

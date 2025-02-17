import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import { Toaster } from "react-hot-toast";
import LoginForm from "./Components/LoginForm";
import RegisterForm from "./Components/RegisterForm";
import HomePage from "./Components/HomePage";

function App() {
  return (
    <>
      <Router>
        <Routes>
          <Route path="/login" element={<LoginForm />} />
          <Route path="/register" element={<RegisterForm />} />
          <Route path="/home" element={<HomePage />} />
          <Route path="/" element={<LoginForm />} />
        </Routes>
      </Router>
      <Toaster />
    </>
  );
}

export default App;

import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import ListEmployeeComponent from "./components/ListEmployeeComponent.jsx";
import HeaderComponent from "./components/HeaderComponent.jsx";
import FooterComponent from "./components/FooterComponent.jsx";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import EmployeeComponent from "./components/EmployeeComponent.jsx";

function App() {
  return (
    <>
      <BrowserRouter>
        <HeaderComponent />
        <Routes>
          {/* // https://localhost:3000/ */}
          <Route path="/" element={<ListEmployeeComponent />}></Route>

          {/* // https://localhost:3000/employees */}
          <Route path="/employees" element={<ListEmployeeComponent />}></Route>

          {/* // https://localhost:3000/add-employee */}
          <Route
            path="/add-employee"
            element={<EmployeeComponent></EmployeeComponent>}
          ></Route>
          {/* // https://localhost:3000/update-employee/id */}
          <Route
            path="/update-employee/:id"
            element={<EmployeeComponent></EmployeeComponent>}
          ></Route>
        </Routes>
        <FooterComponent />
      </BrowserRouter>
    </>
  );
}

export default App;

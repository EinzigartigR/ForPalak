import './App.css';
import Header from './components/Header';
import Footer from './components/Footer';
import NameList from './components/NameList';
import NameTable from './components/NameTable';
import { useState } from 'react';

function App() {
  let [arr,setarr]=useState(["Anna","Raji","Amar","Reni"])

  const addnewname=(name)=>{
    setarr([...arr,name])
  }

  const deleteoldname=(name)=>{
    var newarr = arr.filter((nm)=> nm!==name);
    setarr(newarr)
  }

  const updateintoname=(name)=>{
    
  }
  return (
    <div>
      <Header></Header>
      Search : <input type='text' name='search' id='search' value="search"></input>
      <div className='mydiv'>
      <NameList namearr={arr} insertnewname={addnewname}  removeoldname={deleteoldname} modifyintoname={updateintoname}></NameList>
      </div>
      <div className='mydiv'>
      <NameTable namearr={arr}></NameTable>
      </div>
      <Footer></Footer>
    </div>
  );
}

export default App;

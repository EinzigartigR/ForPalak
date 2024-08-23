import './App.css';
import Header from './components/Header';
import Footer from './components/Footer';
import NameList from './components/NameList';
import NameTable from './components/NameTable';

function App() {
  let arr=["Anna","Raji","Amar","Reni"]
  return (
    <div>
      <Header></Header>
      <div className='mydiv'>
      <NameList namearr={arr}></NameList>
      </div>
      <div className='mydiv'>
      <NameTable namearr={arr}></NameTable>
      </div>
      <Footer></Footer>
    </div>
  );
}

export default App;

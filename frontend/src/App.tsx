import {useEffect, useState} from "react";
import axios from "axios";
import {Todo} from "./types/Types.ts";
import Home from "./pages/Home.tsx";

function App() {
    const [todos, setTodos] = useState<Todo[]>([])

    useEffect(() => {
        axios.get("/api/todos")
            .then(response => {
                console.log(response)
                setTodos(response.data);
            })
            .catch(error => {
                console.log(error);
            })
    }, []);

  return (
    <main>
        <Home todos={todos} />
    </main>
  )
}

export default App

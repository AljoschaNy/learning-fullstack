import {TypeHomePage} from "../types/Types.ts";

function Home({todos}: TypeHomePage) {
    return (
        <>
            <h2>Home</h2>
            {todos.map(todo => <p key={todo.id}>{todo.name}</p>)}
        </>
    )
}

export default Home;
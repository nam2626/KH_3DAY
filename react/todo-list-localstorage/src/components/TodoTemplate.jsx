import { useState } from 'react';
import TodoList from './TodoList';

const list = [
  { id: 1, text: '1번째 할일', done: false },
  { id: 2, text: '2번째 할일', done: false },
  { id: 3, text: '3번째 할일', done: false },
  { id: 4, text: '4번째 할일', done: false },
  { id: 5, text: '5번째 할일', done: false },
];

export default () => {
  const [todoList, setTodoList] = useState([...list]);

  const deleteTodo = (id) => {
    setTodoList(todoList.filter((item) => item.id !== id));
  };

  const updateTodo = (id) => {
    setTodoList(
      todoList.map((todo) => {
        if (todo.id === id) return { ...todo, done: !todo.done };
        return todo;
      }),
    );
  };

  return (
    <>
      <h2>Todo List</h2>

      {/* Todo List 출력하는 컴포넌트  */}
      <TodoList todoList={todoList} deleteTodo={deleteTodo} updateTodo={updateTodo} />
    </>
  );
};

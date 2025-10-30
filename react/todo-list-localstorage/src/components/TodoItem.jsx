export default ({ todo, deleteTodo, updateTodo }) => {
  return (
    <tr>
      <td>{todo.id}</td>
      <td>{todo.text}</td>
      <td>
        <button className="btn btn-primary" onClick={() => updateTodo(todo.id)}>
          Complete
        </button>
      </td>
      <td>
        <button className="btn btn-danger" onClick={(e) => deleteTodo(todo.id)}>
          delete
        </button>
      </td>
    </tr>
  );
};

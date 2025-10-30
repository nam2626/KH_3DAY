import TodoItem from './TodoItem';

export default ({ todoList }) => {
  return (
    <div>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Todo</th>
            <th>Complate</th>
            <th>Delete</th>
          </tr>
        </thead>
        <tbody>
          {todoList.map((item) => (
            <TodoItem key={item.id} todo={item} />
          ))}
        </tbody>
      </table>
    </div>
  );
};

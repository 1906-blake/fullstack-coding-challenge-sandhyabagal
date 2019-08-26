import React from 'react';

interface IState {
    item: any,
    itemId: number,
    itemType: any
}

export class GroceryItems extends React.Component<{}, IState> {

    constructor(props: any) {
        super(props);
        this.state = {
            item: '',
            itemId: 0,
            itemType: ''
        }
    }

    componentDidMount = async () => {
        this.findItems();
      };

    findItems = async () => {
        const resp = await fetch('https://localhost:8070/grocery-items', {
            credentials: 'include',
        });
        const item = await resp.json();
        this.setState({
            ...this.state,
            item,
        });
    }

    render() {
        return (
            <div>
                <h1>Grocery Items</h1>

                <table className="table table-striped table-dark">
                    <thead>
                        <tr>
                            <th scope="col">Items</th>
                            <th scope="col">List ID</th>
                            <th scope="col">Type</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>{item}</td>
                            <td>{listId}</td>
                            <td>{itemType}</td>
                        </tr>
                    </tbody>
                </table>
                <h2>Add New Item to List</h2>
                <form>
                    <input type="text" name="itemName"></input>Item: <br />
                    <input type="text" name="itemType">Type: </input><br />

                    <button type="submit" id="addNewItem">Add Item</button>
                </form>
            </div>
        )
    }
}
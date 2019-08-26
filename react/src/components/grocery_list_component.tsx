import React from 'react';

interface State {
    list: any,
    listId: number
}

export class GroceryList extends React.Component<{}, State> {

    constructor(props: any) {
        super(props);
        this.state = {
            list: null,
            listId: 0
        }
    }

    findLists = async () => {
        const resp = await fetch('https://localhost:8070/grocery-lists', {
            credentials: 'include',
        });
        const list = await resp.json();
        this.setState({
            ...this.state,
            list,
        });
    }

    render() {
        return (
            <div>
                <h1>Grocery Lists</h1> 

                <table className="table table-striped table-dark">
                    <thead>
                        <tr>
                            <th scope="col">Grocery Lists</th>
                            <th scope="col">Store Name</th>
                        </tr>
                    </thead>
                    <tbody>
                            <tr>
                                <td>{list.listId}</td>
                                <td>{list.store}</td>
                            </tr>
                    </tbody>
                </table>
            </div>
        )
    }
}
import React from 'react';

interface IState {
    item: any,
    itemId: number
}

export class GroceryItems extends React.Component<{}, IState> {

    constructor(props: any) {
        super(props);
        this.state = {
            item: null,
            itemId: 0
        }
    }

    findLists = async () => {
        const resp = await fetch('https://localhost:8070/grocery-items', {
            credentials: 'include',
        });
        const item = await resp.json();
        this.setState({
            item
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
                            <th scope="col">List</th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
        )
    }
}
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

    render() {
        return (
            <div>
                <h1>Grocery Lists</h1> 

                <table className="table table-striped table-dark">
                    <thead>
                        <tr>
                            <th scope="col">Grocery Lists</th>
                            <th scope="col">Game</th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
        )
    }
}
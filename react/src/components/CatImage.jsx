import React, { useState } from 'react'

const CatImage = () => {

    const [row, setRow] = useState(300);
    const [col, setCol] = useState(300);

    function rowInc() {
        setRow(row + 10);
    }
    function rowDec() {
        if (row > 10)
            setRow(row - 10);
    }
    function colInc() {
        setCol(col + 10);
    }
    function colDec() {
        if (col > 10)
            setCol(col - 10);
    }

    return (
        <div>
            <div>
                <img
                    src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0maOLJ9j31VumNnnFIgvl1A6pDxuaDIyoeDsQ7sU2yg&s=10"
                    alt="cat"
                    style={{ height: row + "px", width: col + "px" }}
                />
            </div>

            <button onClick={rowInc}>row +</button>
            <button onClick={rowDec}>row -</button>
            <button onClick={colInc}>col +</button>
            <button onClick={colDec}>col -</button>
        </div>
    )
}

export default CatImage
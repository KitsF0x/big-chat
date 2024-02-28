
import React, { useEffect, useState } from 'react';
import axios from 'axios';

const App = () => {
    const [result, setResult] = useState<string>('');

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await axios.get(`http://localhost:8080/hello/asdf`);
                setResult(response.data);
            } catch (error) {
                console.error('Error fetching data:', error);
            }
        };

        fetchData();
    }, []);

    return (
        <div>
            <h1>{result}</h1>
        </div>
    );
};


export default App;

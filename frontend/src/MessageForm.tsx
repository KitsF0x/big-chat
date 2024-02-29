import axios from 'axios';
import React from 'react'

const MessageForm = () => {

    const [message, setMessage] = React.useState('');
    const handleSubmit = async () => {
        try {
            const response = await axios.post(`http://localhost:8080/messages`, { content: message });
            console.log('Response:', response);
        } catch (error) {
            console.error('Error fetching data:', error);
        }
    }
    return (
        <>
            <div>Post o message</div>
            <textarea cols={30} rows={10} value={message} onChange={(e) => setMessage(e.target.value)} ></textarea>
            <button onClick={() => handleSubmit()}>Send</button>
        </>
    )
}

export default MessageForm
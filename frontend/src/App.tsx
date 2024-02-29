
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Message, MessageProps } from './Message';
import MessageForm from './MessageForm';

const App = () => {
    const [messages, setMessages] = useState<MessageProps[]>([]);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await axios.get(`http://localhost:8080/messages`);
                setMessages(response.data);
            } catch (error) {
                console.error('Error fetching data:', error);
            }
        };

        fetchData();
    }, []);

    return (
        <>
            <div>
                <h1>Messages</h1>
                {
                    messages.map((message) => {
                        return <Message id={message.id} content={message.content} createdAt={message.createdAt} updatedAt={message.updatedAt} />
                    })
                }
            </div>
            <div>
                <MessageForm />
            </div>
        </>
    );
};


export default App;

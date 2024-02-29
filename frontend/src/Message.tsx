import React from 'react'

export interface MessageProps {
    id: number;
    content: String;
    createdAt: Date;
    updatedAt: Date;
}

export const Message: React.FC<MessageProps> = (props: MessageProps) => {
    return (
        <div>
            <p>{props.id}</p>
            <p>{props.content}</p>
            <p>{props.createdAt.toLocaleString()}</p>
            <p>{props.updatedAt.toLocaleString()}</p>
        </div>
    )
}

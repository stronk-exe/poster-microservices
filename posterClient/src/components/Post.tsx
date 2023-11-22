import axios from "axios"
import { useState } from "react"

export const Post = () => {

    const [post, setPost] = useState('')

    const newPost = async () => {
        if (post.trim() !== '') {
            await axios.post(`http://localhost:8080/post`, 
            {
                content: post,
            }
            ,{ validateStatus: () => {
                return true
            }, })
            window.location.reload()
        }
    }

    return (
        <div className="new-post">
            <textarea placeholder="new post..." onChange={(e) => setPost(e.target.value)}></textarea>
            <span className="new-post-button" onClick={newPost}>post</span>
        </div>
    )
}

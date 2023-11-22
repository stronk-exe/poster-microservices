import { useState, useEffect } from 'react'
import axios from 'axios'

interface Post {}

export const FYP = () => {

    const [posts, setPosts] = useState<Post[]>([])

    useEffect(() => {

        const fetchPosts = async () => {
            const res = (await axios.get(`http://localhost:8080/post`, { validateStatus: () => {
                return true
            }, })).data
            // console.log(res.data)
            setPosts(res)
        }

        fetchPosts()
    }, [])

    console.log('Posts', posts)

    return (
        <div className='fyp'>
            {
                posts.map((post, index) => (
                    <div className="post" key={index}>
                        <p>{ post?.content }</p>
                    </div>
                ))
            }
        </div>
    )
}

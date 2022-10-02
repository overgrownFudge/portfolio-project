import React from 'react'

import { BsLinkedin, BsGithub, BsMedium } from 'react-icons/bs'

export default function SocialMedia() {
    return (
        <div className='app__social'>
            <div>
                <a href="https://www.linkedin.com/in/ismail-khan-3869bb186/" target="_blank" rel="noreferrer noopener">
                    <BsLinkedin />
                </a>
            </div>
            <div>
            <a href="https://github.com/overgrownFudge" target="_blank" rel="noreferrer noopener">
                    <BsGithub />
                </a>
            </div>
            <div>
            <a href="https://medium.com/@overgrownfudge" target="_blank" rel="noreferrer noopener">
                    <BsMedium />
                </a>
            </div>
        </div>
    )
}

import React from 'react'

import { About, Header, Footer, Work, Skills, Testimonial } from './container/index.js'
import { Navbar } from './components'
import './App.scss'

export default function App() {
    return (
        <div className='app'>
            <Navbar />
            <Header />
            <About />
            <Work />
            <Skills />
            <Testimonial />
            <Footer />
        </div>
    )
}
import React from 'react';
import { motion } from 'framer-motion';

import './About.scss';
import {images} from '../../constants'
import { AppWrap, MotionWrap } from '../../wrapper'

function About(){

  const abouts = [
    {title:'Web Dev', description: "I thrive on building quality systems that surpass end users' expectations!",  imgUrl: images.about05},
    {title:'Frontend', description: 'Frontend UI is my strong suit. I specialize in ReactJS with JavaScript, TypeScript, HTML, SCSS, and Bootstrap!', imgUrl: images.about02},
    {title:'Backend', description: 'In Backend technologies, I am proficient in Java, Spring Boot, and NodeJS!', imgUrl: images.about03},
  ]

  return (
    <>
      <h2 className="head-text">I Know that <span>Good Design</span> <br />means  <span>Good Business</span></h2>

      <div className="app__profiles">
        {abouts.map((about, index) => (
          <motion.div
            whileInView={{ opacity: 1 }}
            whileHover={{ scale: 1.1 }}
            transition={{ duration: 0.3, type: 'tween' }}
            className="app__profile-item"
            key={about.title + index}
          >
            <img src={about.imgUrl} alt={about.title} />

            <h2 className="bold-text" style={{ marginTop: 20 }}>{about.title}</h2>
            <p className="p-text" style={{ marginTop: 10 }}>{about.description}</p>
          </motion.div>
        ))}
      </div>
    </>
  );
};

export default AppWrap(MotionWrap (About, 'app__about'), 'about', 'app__whitebg')
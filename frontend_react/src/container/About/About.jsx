import React from 'react';
import { motion } from 'framer-motion';

import './About.scss';
import {images} from '../../constants'

export default function About(){

  const abouts = [
    {title:'Web Dev', description: 'I am an awesome Web Dev!', imgUrl: images.about05},
    {title:'Frontend', description: 'I am an awesome Frontend Dev!', imgUrl: images.about02},
    {title:'Backend', description: 'I am an awesome Backend Dev!', imgUrl: images.about03},
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


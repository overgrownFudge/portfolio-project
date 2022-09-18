import React from 'react'
import { motion } from 'framer-motion'

export default function AppWrap(Component, classNames) {
    return function () {
        return (
            <motion.div
                whileInView={{ y: [100, 50, 0], opacity: [0, 0, 1] }}
                transition={{ duration: 0.5 }}
                className={`${classNames} app__flex`}
            >
                <Component />
            </motion.div>
        );
    }
};

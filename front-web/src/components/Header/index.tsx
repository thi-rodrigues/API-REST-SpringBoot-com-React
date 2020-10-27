import React from 'react';
import { ReactComponent as Logo } from '../../assets/logo.svg';
import { Link } from 'react-router-dom';
import './styles.css'

const Header = () => (
    <Link to="/">
        <header className="main-header">
            <Logo />
            <div className="logo-text">
                <span className="logo-text-1">Big Game</span>
                <span className="logo-text-2"> Survey</span>
            </div>
        </header>
    </Link>
    
)

export default Header;
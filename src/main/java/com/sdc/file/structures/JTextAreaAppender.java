package com.sdc.file.structures;

import javax.swing.JTextArea;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

/**
 * A Log4J appender that empties into a text area.
 */
public class JTextAreaAppender extends AppenderSkeleton
{
    //--------------------------------------------------------------------------
    // Fields
    //--------------------------------------------------------------------------

    /**
     * Text area that logging statements are directed to.
     */
    private JTextArea textArea;

    //--------------------------------------------------------------------------
    // Constructors
    //--------------------------------------------------------------------------

    public JTextAreaAppender() {

    }
    
    //--------------------------------------------------------------------------
    // Public
    //--------------------------------------------------------------------------
    /**
	 * @return the textArea_
	 */
	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * @param textArea the textArea_ to set
	 */
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

    
    //--------------------------------------------------------------------------
    // Overrides org.apache.log4j.AppenderSkeleton
    //--------------------------------------------------------------------------


	/**
     * @see org.apache.log4j.AppenderSkeleton#append(
     *      org.apache.log4j.spi.LoggingEvent)
     */
    public void append(LoggingEvent loggingEvent)
    {
        textArea.append(this.layout.format(loggingEvent));
    }


    /**
     * @see org.apache.log4j.Appender#requiresLayout()
     */
    public boolean requiresLayout()
    {
        return false;
    }


    /**
     * @see org.apache.log4j.Appender#close()
     */
    public void close()
    {
    }
    
 
    
    
}
package src.svg;

import java.util.ArrayList;
import java.util.List;


//-----------------------------------------------------------------------------

/**
 * Contents of an SVG file. 
 * @author cambolbro
 */
public class SVG
{
	private final List<src.svg.element.Element> elements = new ArrayList<src.svg.element.Element>();

	//-------------------------------------------------------------------------
	
	public List<src.svg.element.Element> elements()
	{
		return elements;
	}
	
	//-------------------------------------------------------------------------

	public void clear()
	{
		elements.clear();
	}
	
	//-------------------------------------------------------------------------

	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder();
		
		sb.append(elements.size() + " elements:\n");
		for (src.svg.element.Element element : elements)
			sb.append(element + "\n");
		
		return sb.toString();
	}

	//-------------------------------------------------------------------------
	
}

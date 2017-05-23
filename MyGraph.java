import java.util.ArrayList;

public class MyCITS2200Project implements CITS2200Project {
	
	private ArrayList<ArrayList<Boolean>> matrix;
	private ArrayList<String> url;
	
	public MyCITS2200Project(){
		matrix = new ArrayList<ArrayList<Boolean>>();
		url = new ArrayList<String>();
	}

	@Override
	public void addEdge(String urlFrom, String urlTo) {
		// TODO Auto-generated method stub
		if(!url.contains(urlFrom)){
			url.add(urlFrom);
			
			//.get(url.indexOf(urlFrom)).get(url.indexOf(urlTo)) = true;
		}
		
		else matrix.get(url.indexOf(urlFrom)).get(url.indexOf(urlTo)) = true;
	}

	@Override
	public int getShortestPath(String urlFrom, String urlTo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] getCenters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[][] getStronglyConnectedComponents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getHamiltonianPath() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

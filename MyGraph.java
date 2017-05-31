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
		if(matrix.isEmpty())
		{
			url.add(urlFrom);
			url.add(urlTo);
			matrix.add(new ArrayList<Boolean>(2));
			matrix.add(new ArrayList<Boolean>(2));			
		}
		else if(!url.contains(urlFrom)){
			url.add(urlFrom);
			int n = matrix.size();
			for(int i = 0; i <n; i++){
				matrix.get(i).add(false);
			}
			matrix.add(new ArrayList<Boolean>(n+1));
		}
			
		else if(!url.contains(urlTo)){
			url.add(urlTo);
			int n = matrix.size();
			for(int i = 0; i <n; i++){
				matrix.get(i).add(false);
			}
			matrix.add(new ArrayList<Boolean>(n+1));
		}
		
		matrix.get(url.indexOf(urlFrom)).get(url.indexOf(urlTo)).set(true);
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

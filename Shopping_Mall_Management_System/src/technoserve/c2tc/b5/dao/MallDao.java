package technoserve.c2tc.b5.dao;

public interface MallDao {
	public void addMall(MallDao malldao);
	public void updateMall(MallDao malldao);
	public  MallDao SearchMall(long id); 
    public void startTranscaion();
    public void EndTranscaion();
	
}

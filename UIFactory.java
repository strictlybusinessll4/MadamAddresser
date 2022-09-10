public class UIFactory implements Factory {
	public Prefix getPrefix(String prefix)
	{
		if(prefix.equals("Mr")) {
			return new MrPrefix();
		} else {
			return new MrsPrefix();
		}
	}
}

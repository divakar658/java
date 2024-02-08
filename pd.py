import pandas as pd
row1=["divakar",1,10]
row2=["tony",2,10]
row3=["stark",3,8]
df=pd.DataFrame([row1,row2,row3],columns=["name","no","rating"])
print(df)
